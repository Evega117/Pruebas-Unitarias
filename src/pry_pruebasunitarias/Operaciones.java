package pry_pruebasunitarias;
public class Operaciones {
    public float num3;

    public float Suma(float num1, float num2){
        num3=num1+num2;
        return num3;
    }
    public float Res(float num1, float num2){
        num3=num1-num2;
        return num3;
    }
    public float Multi(float num1, float num2){
        num3 = num1*num2;
        return num3;
    }
    public float Div(float num1, float num2){
        if(num1>num2){
            num3 = num1 / num2;
            return num3;
        }else{
            return 0;
        }
    }
}
