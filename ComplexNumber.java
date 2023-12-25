class ComplexNumber{
    private float a;
    private float b;
    private float newA;
    private float newB;
    ComplexNumber newComplex;
    public ComplexNumber(float _a, float _b){
        a = _a;
        b = _b;
    }
    public float getA(){
        return a;
    }
    public float getB(){
        return b;
    }
    //Сложение
    public ComplexNumber addition(ComplexNumber otherNumber){
        newA = a + otherNumber.getA();
        newB = b + otherNumber.getB();
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }
    //Вычитание
    public ComplexNumber subtract(ComplexNumber otherNumber){
        newA = a - otherNumber.getA();
        newB = b - otherNumber.getB();
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }
    //Умножение
    public ComplexNumber multiply(ComplexNumber otherNumber){
        newA = (a * otherNumber.getA()) - (b * otherNumber.getB());
        newB = (b * otherNumber.getA()) + (a * otherNumber.getB());
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }
    //Деление
    public ComplexNumber divide(ComplexNumber otherNumber){
        newA = ((a * otherNumber.getA()) + (b * otherNumber.getB())) / ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
        newB = ((b * otherNumber.getA()) - (a * otherNumber.getB())) / ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }
    //Для выведения на консоль в читаемом виде
    public String toString(){
        return "(" + a + ") + (" + b + ")i";
    }
}