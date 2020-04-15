public class EvenThread extends Thread {
    public boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            if (isEvenNumber(i)){
                System.out.println(i);

                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
