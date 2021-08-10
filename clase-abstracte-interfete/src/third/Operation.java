package third;

public class Operation implements Minus, Plus, Mult, Div {
    float number;

    public Operation(float number){
        this.number = number;
    }

    public void Minus(float number){
        this.number = this.number - number;
    }

    public void Plus(float number){
        this.number = this.number + number;
     }
    public void Mult(float number){
        this.number = this.number * number;
    }

    public void Div(float number){
        if (number == 0 )
            return;
        this.number = this.number/number;
    }

    public float getNumber() {
        return this.number;
    }

}
