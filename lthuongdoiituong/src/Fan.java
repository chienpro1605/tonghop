 class Fan {
    int speech  = 1;
    boolean on = false;
    double radius = 5;
    String color = "blue";
    public int getSpeech(){
        return speech;
    }
    public void setSpeech(int speech){
        this.speech=speech;
    }
    public boolean getOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        if (!on) return "fan is of";
        return "fan{" +
                "speed=" + speech +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
class Chay{
    public static void main(String[] args) {
        Fan fan1 = new Fan();
         Fan fan2 = new Fan();
         fan1.setSpeech(3);
         fan1.setRadius(10);
         fan1.setColor("yellow");
         fan1.setOn(true);
         fan2.setSpeech(2);
         fan2.setRadius(5);
         fan2.setColor("blue");
         fan2.setOn(false);
        System.out.println(fan1);
        System.out.println(fan2);

}
}

