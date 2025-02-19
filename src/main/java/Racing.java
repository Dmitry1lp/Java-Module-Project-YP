public class Racing {
    String leaderCar = "";
    int leaderDistance = 0;
    final int time = 24;

    public void getLeader(String[] cars, int[] speed) {
        for (int i = 0; i < cars.length; i++) {
            int distance = time * speed[i];

            if (distance > leaderDistance) {
                leaderCar = cars[i];
                leaderDistance = distance;
            }
        }
        System.out.println("Самая быстрая машина: " + leaderCar);
    }

}

