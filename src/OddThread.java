public class OddThread extends Thread {
    public boolean isOddNumber(int number) {
        return number % 2 != 0;
    }

    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            if (isOddNumber(i)){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
