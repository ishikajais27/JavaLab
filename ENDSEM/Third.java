class Mean extends Thread {
    int[] nums;
    Mean(int[] nums) { this.nums = nums; }
    public void run() {
        try { Thread.sleep(1000); } catch (Exception e) {}
        int sum = 0;
        for (int n : nums) sum += n;
        System.out.println("Mean: " + (sum / (double) nums.length));
    }
}

class Median extends Thread {
    int[] nums;
    Median(int[] nums) { this.nums = nums; }
    public void run() {
        try { Thread.sleep(5000); } catch (Exception e) {}
        int[] copy = nums.clone();
        java.util.Arrays.sort(copy);
        double med;
        int mid = copy.length / 2;
        if (copy.length % 2 == 0)
            med = (copy[mid - 1] + copy[mid]) / 2.0;
        else
            med = copy[mid];
        System.out.println("Median: " + med);
    }
}

class Mode extends Thread {
    int[] nums;
    Mode(int[] nums) { this.nums = nums; }
    public void run() {
        try { Thread.sleep(10000); } catch (Exception e) {}
        int max = 0, modeNum = nums[0];
        for (int i : nums) {
            int count = 0;
            for (int j : nums) if (j == i) count++;
            if (count > max) {
                max = count;
                modeNum = i;
            }
        }
        System.out.println("Mode: " + modeNum);
    }
}

public class Third {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5, 5, 5, 6};

        Mean t1 = new Mean(nums);
        Median t2 = new Median(nums);
        Mode t3 = new Mode(nums);

        t1.start();
        t2.start();
        t3.start();
    }
}
