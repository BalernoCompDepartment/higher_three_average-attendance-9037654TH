class Main {
  public static void main(String[] args) {
    int total = 0;
    for (int index = 0; index < 8; index++){
      int attendance = Keyboard.getInt(" ");
      total = total + attendance;
    }

    double average = (double) total / 8;

    int roundAverage = (int) Math.round(average);

    System.out.println("Hello world " + roundAverage + " ");
  }
}