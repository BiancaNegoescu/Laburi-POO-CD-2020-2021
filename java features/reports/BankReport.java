package com.poo.lab12.reports;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.poo.lab12.entities.*;

public class BankReport {
    // Customer = Employee of the Business
    // Business = a client of the Bank
    // Customers of the Bank = all the Employees that work for the Businesses that are clients of the Bank

    public static int getNumberOfCustomers(Bank bank) {
        // All the customers that have accounts at the bank
        int numberCostumers = 0;
        for (Business business : bank.getClients()) {
            numberCostumers += business.getEmployees().size();
        }
        return numberCostumers;
    }

    public static int getNumberOfAccounts(Bank bank) {
        // Accounts of all the customers of the bank
        long numberofAccounts = 0;
        for (Business business : bank.getClients()) {
            for (Employee employee : business.getEmployees()) {
               // numberofAccounts+=Arrays.asList(employee.getAccounts()).stream().count();
               // if (employee.getAccounts() != null) {
                    numberofAccounts += employee.getAccounts().size();
               // }
            }
        }
        return (int)numberofAccounts;
    }

    public static SortedSet<Employee> getCustomersSorted(Bank bank) {
        // Display the set of customers in alphabetical order
        Comparator<Employee> comparator = Comparator.comparing(Employee::getName);
        TreeSet<Employee> allEmployees = new TreeSet<>(comparator);
        for (Business business : bank.getClients()) {
            allEmployees.addAll(business.getEmployees());
        }
        return allEmployees;
    }

    public static double getTotalSumInAccounts(Bank bank) {
        // Sum of all customers' accounts balances
        double totalSum = 0;
        for (Business business : bank.getClients()) {
            for (Employee employee : business.getEmployees()) {
                for (Account account : employee.getAccounts()) {
                    totalSum += account.getBalance();
                }
            }
        }
        return totalSum;
    }

    public static SortedSet<Account> getAccountsSortedBySum(Bank bank) {
        // The set of all accounts, ordered by current account balance
        Comparator<Account> comparator = Comparator.comparing(Account::getBalance);
        TreeSet<Account> allAccounts = new TreeSet<>(comparator);
        for (Business business : bank.getClients()) {
            for (Employee employee : business.getEmployees()) {
                allAccounts.addAll(employee.getAccounts());
            }
        }
        return allAccounts;
    }

    public static Map<Employee, Collection<Account>> getCustomerAccounts(Bank bank) {
        // Return a map of all the customers with their respective accounts
        Map<Employee, Collection<Account>> map = new HashMap<>();
        for (Business business : bank.getClients()) {
            for (Employee employee : business.getEmployees()) {
                map.put(employee, employee.getAccounts());
            }
        }
        return map;
    }

    public static Map<String, List<Employee>> getCustomersByCity(Bank bank) {
        // Map all the customers to their respective cities
        Map<String, List<Employee>> map = new HashMap<>();
        for (Business business : bank.getClients()) {
            for (Employee employee : business.getEmployees()) {
                if (!map.containsKey(employee.getCity())) {
                    map.put(employee.getCity(), new ArrayList<>());
                }
                map.get(employee.getCity()).add(employee);
            }
        }
        return map;
    }

    public static Project getProjectWorkedOnByMostCustomers(Bank bank) {
        // Get all the projects from the employees and find the most repeated one in the list
        Map<Project, Integer> map = new HashMap<>();
        for (Business business : bank.getClients()) {
            for (Employee employee : business.getEmployees()) {
                for (Project project : employee.getProjects()) {
                    if (!map.containsKey(project)) {
                        map.put(project, 1);
                    }
                    else {
                        int value = map.get(project);
                        value ++;
                        map.replace(project, value);
                    }
                }
            }
        }
        List<Integer> projectsByNumber = new ArrayList<>(map.values());
        Collections.sort(projectsByNumber);
        int max = projectsByNumber.get(projectsByNumber.size() - 1);
        for (Map.Entry<Project, Integer> pair : map.entrySet()) {
            if (pair.getValue().equals(max)) {
                return pair.getKey();
            }
        }
        return null;
    }

    public static Gender getGenderWhoWorkedOnMostProjects(Bank bank) {
        // Get all the pairs <gender, project> or <gender, List<project>>, then reduce the array to only one pair
        // of each gender and retrieve the one with most counted projects (you are expected to count duplicates as well).
        int females = 0;
        int males = 0;
        for (Business business : bank.getClients()) {
            for (Employee employee : business.getEmployees()) {
                if (employee.getGender().equals(Gender.MALE)) {
                    males += employee.getProjects().size();
                }
                else {
                    females += employee.getProjects().size();
                }
            }
        }
        if (females > males) {
            return Gender.FEMALE;
        }
        else {
            return Gender.MALE;
        }
    }
}
