import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class tz_2_programTest {
    private int[] numbers;

    public void setUp(String file_name) {
        try {
            File file = new File(file_name);
            Scanner scanner_1 = new Scanner(file);
            String line = scanner_1.nextLine();
            scanner_1.close();

            String[] numbersAsString = line.split(" ");
            numbers = new int[numbersAsString.length];
            for (int i = 0; i < numbersAsString.length; i++) {
                numbers[i] = Integer.parseInt(numbersAsString[i]);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        }
    }
    
    @Test
    public void _lie() {
    long startTime = System.currentTimeMillis();
    setUp("src/test/_tests/test1.txt");
    int max = tz_2_program._max(numbers);
    long endTime = System.currentTimeMillis();
    long elapsedTime = endTime - startTime;
    assertEquals(max, 12);
    assertTrue(elapsedTime >= 0);
    }

    @Test
    public void _min1() {
        setUp("src/test/_tests/minmax1.txt");
        int min = tz_2_program._min(numbers);
        assertEquals(min, 1);
    }


    @Test
    public void _max1() {
        setUp("src/test/_tests/minmax1.txt");
        int max = tz_2_program._max(numbers);
        assertEquals(max, 9);
    }

    @Test
    public void _sum1() {
        setUp("src/test/_tests/minmax1.txt");
        long cur = tz_2_program._sum(numbers);
        assertEquals(cur, 30);
    }

    @Test
    public void _mult1() {
        setUp("src/test/_tests/minmax1.txt");
        String cur = tz_2_program._mult(numbers);
        assertEquals(cur, "1260");
    }
    @Test
    public void _min2() {
        setUp("src/test/_tests/minmax2.txt");
        int min = tz_2_program._min(numbers);
        assertEquals(min, 1);
    }


    @Test
    public void _max2() {
        setUp("src/test/_tests/minmax2.txt");
        int max = tz_2_program._max(numbers);
        assertEquals(max, 9);
    }

    @Test
    public void _sum2() {
        setUp("src/test/_tests/minmax2.txt");
        long cur = tz_2_program._sum(numbers);
        assertEquals(cur, 45);
    }

    @Test
    public void _mult2() {
        setUp("src/test/_tests/minmax2.txt");
        String cur = tz_2_program._mult(numbers);
        assertEquals(cur, "362880");
    }
    @Test
    public void _min3() {
        setUp("src/test/_tests/minmax3.txt");
        int min = tz_2_program._min(numbers);
        assertEquals(min, -100);
    }

    @Test
    public void _max3() {
        setUp("src/test/_tests/minmax3.txt");
        int max = tz_2_program._max(numbers);
        assertEquals(max, 912);
    }

    @Test
    public void _sum3() {
        setUp("src/test/_tests/minmax3.txt");
        long cur = tz_2_program._sum(numbers);
        assertEquals(cur, 1279);
    }

    @Test
    public void _mult3() {
        setUp("src/test/_tests/minmax3.txt");
        String cur = tz_2_program._mult(numbers);
        assertEquals(cur, "-16137190656000");
    }
    @Test
    public void _min4() {
        setUp("src/test/_tests/test1.txt");
        int min = tz_2_program._min(numbers);
        assertEquals(min, 77880);
    }

    @Test
    public void _max4() {
        setUp("src/test/_tests/test1.txt");
        int max = tz_2_program._max(numbers);
        assertEquals(max, 945915);
    }
    
    @Test
    public void _max4time() {
    long startTime = System.currentTimeMillis();
    setUp("src/test/_tests/test1.txt");
    int max = tz_2_program._max(numbers);
    long endTime = System.currentTimeMillis();
    long elapsedTime = endTime - startTime;
    assertEquals(max, 945915);
    assertTrue(elapsedTime >= 0);
    }


    @Test
    public void _sum4() {
        setUp("src/test/_tests/test1.txt");
        long cur = tz_2_program._sum(numbers);
        assertEquals(cur, 5123979);
    }

    @Test
    public void _mult4() {
        setUp("src/test/_tests/test1.txt");
        String cur = tz_2_program._mult(numbers);
        assertEquals(cur, "-5050079263798634496");
    }
    public void _min5() {
        setUp("src/test/_tests/test2.txt");
        int min = tz_2_program._min(numbers);
        assertEquals(min, 1104);
    }

    @Test
    public void _max5() {
        setUp("src/test/_tests/test2.txt");
        int max = tz_2_program._max(numbers);
        assertEquals(max, 999921);
    }
    @Test
    public void _max5time() {
    long startTime = System.currentTimeMillis();
    setUp("src/test/_tests/test2.txt");
    int max = tz_2_program._max(numbers);
    long endTime = System.currentTimeMillis();
    long elapsedTime = endTime - startTime;
    assertEquals(max, 999921);
    assertTrue(elapsedTime >= 0);
    }

    @Test
    public void _sum5() {
        setUp("src/test/_tests/test2.txt");
        long cur = tz_2_program._sum(numbers);
        assertEquals(cur, 508134433);
    }

    @Test
    public void _mult5() {
        setUp("src/test/_tests/test2.txt");
        String cur = tz_2_program._mult(numbers);
        assertEquals(cur, "произведение вышло за пределы диапазона значений long");
    }
    public void _min6() {
        setUp("src/test/_tests/test3.txt");
        int min = tz_2_program._min(numbers);
        assertEquals(min, 1);
    }

    @Test
    public void _max6() {
        setUp("src/test/_tests/test3.txt");
        int max = tz_2_program._max(numbers);
        assertEquals(max, 1000000);
    }
    
    @Test
    public void _max6time() {
    long startTime = System.currentTimeMillis();
    setUp("src/test/_tests/test3.txt");
    int max = tz_2_program._max(numbers);
    long endTime = System.currentTimeMillis();
    long elapsedTime = endTime - startTime;
    assertEquals(max, 1000000);
    assertTrue(elapsedTime >= 0);
    }


    @Test
    public void _sum6() {
        setUp("src/test/_tests/test3.txt");
        long cur = tz_2_program._sum(numbers);
        String q = String.valueOf(cur);
        assertEquals(q, "499953798489");
    }

    @Test
    public void _mult6() {
        setUp("src/test/_tests/test3.txt");
        String cur = tz_2_program._mult(numbers);
        assertEquals(cur, "произведение вышло за пределы диапазона значений long");
    }
}


