import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    static void whatsNext(String[] arr) {
        /*
         * Write your code here.
         */
        int length = arr.length;
        ArrayList<BigInteger> arrayList = new ArrayList<>();
        if (length == 1) {
            if (arr[0].equals("1")) {
                arrayList.add(BigInteger.valueOf(1));
                arrayList.add(BigInteger.valueOf(1));
            } else {
                arrayList.add(BigInteger.valueOf(1));
                arrayList.add(BigInteger.valueOf(1));
                BigInteger a = new BigInteger(arr[0]);
                BigInteger b = new BigInteger("-1");
                BigInteger sonuc = a.add(b);
                arrayList.add(sonuc);
            }
        } else if (length == 2) {
            if (arr[1].equals("1")) {
                if (arr[0].equals("1")) {

                    arrayList.add(BigInteger.valueOf(1));
                    arrayList.add(BigInteger.valueOf(2));
                } else {
                    arrayList.add(BigInteger.valueOf(1));
                    arrayList.add(BigInteger.valueOf(2));
                    BigInteger a = new BigInteger(arr[0]);
                    BigInteger b = new BigInteger("-1");
                    BigInteger sonuc = a.add(b);
                    arrayList.add(sonuc);
                }
            } else {
                if (arr[0].equals("1")) {
                    arrayList.add(BigInteger.valueOf(1));
                    BigInteger a = new BigInteger(arr[1]);
                    BigInteger b = new BigInteger("1");
                    BigInteger sonuc = a.add(b);
                    arrayList.add(sonuc);

                } else {
                    arrayList.add(BigInteger.valueOf(1));
                    BigInteger a = new BigInteger(arr[1]);
                    BigInteger b = new BigInteger("1");
                    BigInteger sonuc = a.add(b);
                    arrayList.add(sonuc);
                    BigInteger c = new BigInteger(arr[0]);
                    BigInteger d = new BigInteger("-1");
                    sonuc = c.add(d);
                    arrayList.add(sonuc);
                }
            }


        } else if (length == 3) {
            if (arr[2].equals("1")) {
                if (arr[1].equals("1")) {

                    BigInteger a = new BigInteger(arr[0]);
                    BigInteger b = new BigInteger("1");
                    BigInteger sonuc = a.add(b);
                    arrayList.add(sonuc);

                    arrayList.add(BigInteger.valueOf(1));
                } else {
                    BigInteger a = new BigInteger(arr[0]);
                    arrayList.add(a);
                    a = new BigInteger(arr[1]);
                    BigInteger b = new BigInteger("-1");
                    BigInteger sonuc = a.add(b);
                    arrayList.add(sonuc);
                    arrayList.add(BigInteger.valueOf(1));
                    arrayList.add(BigInteger.valueOf(1));
                }
            } else {
                if (arr[1].equals("1")) {
                    BigInteger a = new BigInteger(arr[0]);
                    BigInteger b = new BigInteger("1");
                    BigInteger sonuc = a.add(b);
                    arrayList.add(sonuc);
                    arrayList.add(BigInteger.valueOf(1));
                    a = new BigInteger(arr[2]);
                    b = new BigInteger("-1");
                    sonuc = a.add(b);
                    arrayList.add(sonuc);

                } else {
                    BigInteger a = new BigInteger(arr[0]);
                    arrayList.add(a);
                    a = new BigInteger(arr[1]);
                    BigInteger b = new BigInteger("-1");
                    BigInteger sonuc = a.add(b);
                    arrayList.add(sonuc);
                    arrayList.add(BigInteger.valueOf(1));
                    arrayList.add(BigInteger.valueOf(1));
                    a = new BigInteger(arr[2]);
                    sonuc = a.add(b);
                    arrayList.add(sonuc);
                }
            }


        }
        //Son index çift
        else if (length % 2 == 1) {
            for (int i = 0; i < length - 2; i++) {
                BigInteger a = new BigInteger(arr[i]);
                arrayList.add(a);
            }
            //son indexte 1 tane 1 taneden fazla 1 var
            if (!arr[length - 1].equals("1")) {
                if (!arr[length - 2].equals("1")) {
                    BigInteger a = new BigInteger(arr[length - 2]);
                    BigInteger b = new BigInteger("-1");
                    BigInteger sonuc = a.add(b);
                    arrayList.add(sonuc);
                    arrayList.add(BigInteger.valueOf(1));
                    arrayList.add(BigInteger.valueOf(1));
                    a = new BigInteger(arr[length - 1]);
                    sonuc = a.add(b);
                    arrayList.add(sonuc);
                } else {
                    BigInteger a = arrayList.get(length - 3);
                    BigInteger b = new BigInteger("1");
                    BigInteger sonuc = a.add(b);

                    arrayList.set(length - 3, sonuc);
                    arrayList.add(BigInteger.valueOf(1));
                    a = new BigInteger(arr[length - 1]);
                    b = new BigInteger("-1");
                    sonuc = a.add(b);
                    arrayList.add(sonuc);
                }
                //son indexte bir tane 1 var.
            } else {
                if (!arr[length - 2].equals("1")) {
                    BigInteger a = new BigInteger(arr[length - 2]);
                    BigInteger b = new BigInteger("-1");
                    BigInteger sonuc = a.add(b);
                    arrayList.add(sonuc);
                    arrayList.add(BigInteger.valueOf(1));
                    arrayList.add(BigInteger.valueOf(1));
                } else {
                    BigInteger a = arrayList.get(length - 3);
                    BigInteger b = new BigInteger("1");
                    BigInteger sonuc = a.add(b);
                    arrayList.set(length - 3, sonuc);
                    arrayList.add(BigInteger.valueOf(1));

                }


            }

        } else {//son index tek
            for (int i = 0; i < length - 3; i++) {
                BigInteger a = new BigInteger(arr[i]);
                arrayList.add(a);
            }
            if (arr[length - 2].equals("1")) {
                if (arr[length - 3].equals("1")) {
                    BigInteger a = arrayList.get(length - 4);
                    BigInteger b = new BigInteger("1");
                    BigInteger sonuc = a.add(b);
                    arrayList.set(length - 4, sonuc);
                    a = new BigInteger(arr[length - 1]);
                    sonuc = a.add(b);
                    arrayList.add(sonuc);
                } else {
                    BigInteger a = new BigInteger(arr[length - 3]);
                    BigInteger b = new BigInteger("-1");
                    BigInteger sonuc = a.add(b);
                    arrayList.add(sonuc);
                    arrayList.add(BigInteger.valueOf(1));
                    a = new BigInteger(arr[length - 1]);
                    b = new BigInteger("1");
                    sonuc = a.add(b);
                    arrayList.add(sonuc);

                }

            } else {
                if (arr[length - 3].equals("1")) {
                    BigInteger a = arrayList.get(length - 4);
                    BigInteger b = new BigInteger("1");
                    BigInteger sonuc = a.add(b);
                    arrayList.set(length - 4, sonuc);
                    a = new BigInteger(arr[length - 1]);
                    b = new BigInteger(arr[length - 3]);
                    sonuc = a.add(b);
                    arrayList.add(sonuc);
                    a = new BigInteger(arr[length - 2]);
                    b = new BigInteger("-1");
                    sonuc = a.add(b);
                    arrayList.add(sonuc);
                } else {
                    BigInteger a = new BigInteger(arr[length - 3]);
                    BigInteger b = new BigInteger("-1");
                    BigInteger sonuc = a.add(b);
                    arrayList.add(sonuc);
                    arrayList.add(BigInteger.valueOf(1));
                    a = new BigInteger(arr[length - 1]);
                    b = new BigInteger("1");
                    sonuc = a.add(b);
                    arrayList.add(sonuc);
                    a = new BigInteger(arr[length - 2]);
                    b = new BigInteger("-1");
                    sonuc = a.add(b);
                    arrayList.add(sonuc);

                }
            }


        }

        System.out.println(arrayList.size());
        for (int l = 0; l < arrayList.size() - 1; l++) {
            System.out.print(arrayList.get(l) + " ");
        }
        System.out.print(arrayList.get(arrayList.size() - 1));
        System.out.println();

    }


    public static void main(String[] args) throws FileNotFoundException {
        File file =
                new File("input00.txt");
        Scanner scanner = new Scanner(file);
        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int arrCount = Integer.parseInt(scanner.nextLine().trim());

            String[] arr = new String[arrCount];

            String[] arrItems = scanner.nextLine().split(" ");

            for (int arrItr = 0; arrItr < arrCount; arrItr++) {
                String arrItem = arrItems[arrItr].trim();
                arr[arrItr] = arrItem;
            }

            whatsNext(arr);
        }


    }

}
