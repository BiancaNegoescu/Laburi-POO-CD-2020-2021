package task1;

public class MyString {
    private String str;

    MyString(String newStr) {
        str = newStr;
    }

    @Override
    public int hashCode() {
        int hashCode = 0;
        int len = str.length();

        for (int i = 0; i < len; ++i) {
            hashCode += str.charAt(i) * 31;
        }

        return hashCode;
    }

    @Override
    public String toString() {
        return str;
    }
}