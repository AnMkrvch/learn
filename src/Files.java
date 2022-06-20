import java.io.*;
import java.util.*;

public class Files {
    public static void main(String[] args) {

        File file1 = new File("D:\\Angelina\\Documents\\2_copied.txt");
        File file2 = new File("D:\\Angelina\\Documents\\2.txt");
        try {
            String text1 = e6(file1);
            String text2 = e6(file2);
            System.out.println(Objects.equals(text1, text2));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String e6(File file) throws IOException {
        FileReader fread = new FileReader(file);
        BufferedReader bfread = new BufferedReader(fread);
        String str;
        StringBuilder srez = new StringBuilder();
        while ((str = bfread.readLine()) != null) {
            srez.append(str);
        }
        return srez.toString();
    }

    public static void e18_2() {
        String longestWord = "";
        String current;
        Scanner sc;
        try {
            sc = new Scanner(new File("D:\\Angelina\\Documents\\1.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longestWord.length()) {
                longestWord = current;
            }
        }
        System.out.println("\n" + longestWord + "\n");
    }

    public static void e18() {
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        Scanner sc;
        String rez = "";
        String now;
        try {
            sc = new Scanner(file);
            while (sc.hasNext()) {
                now = sc.next();
                if (now.length() > rez.length()) {
                    rez = now;
                }
            }
            System.out.println(" the longest word : " + rez);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void e17_2() {
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        try (FileReader fread = new FileReader(file)){
            LineNumberReader lread = new LineNumberReader(fread);
            String str;
            while (lread.getLineNumber() < 3 && (str = lread.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void e17() {
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        try (FileReader fread = new FileReader(file);  BufferedReader bfread = new BufferedReader(fread)){
            String str;
            int count = 0;
            while (count < 3) {
                str = bfread.readLine();
                System.out.println(str);
                count++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void e16() {
        File f = new File("D:\\Angelina\\Documents\\1.txt");
        try ( FileWriter fwr = new FileWriter(f, true) ) {
            fwr.write("\nEnjoy every moment.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void e15() {
        File f = new File("D:\\Angelina\\Documents\\file15.txt");
        try (FileWriter fw = new FileWriter(f);   FileReader  fr = new FileReader(f) ) {
            fw.write("hello, how are you ");
            int i;
            fw.close();
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void e14() {
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        try (FileReader fread = new FileReader(file); BufferedReader bfread = new BufferedReader(fread)){
            String str;
            List<String> text = new ArrayList<>();
            while ((str = bfread.readLine()) != null) {
                text.add(str);
            }
            bfread.close();
            for (String line : text) {
                System.out.print(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void e13() {
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        try (FileReader fread = new FileReader(file);
             BufferedReader bfread = new BufferedReader(fread)) {
            String str;
            StringBuilder text = new StringBuilder();
            while ((str = bfread.readLine()) != null) {
                text.append(str);
                System.out.println(str);
            }
            bfread.close();
            System.out.print(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void e12() {
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        try (FileReader fread = new FileReader(file)) {
            int i;
            while ((i = fread.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void e11() {
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        try (FileReader fread = new FileReader(file);
             BufferedReader bfread = new BufferedReader(fread)) {
            String str;
            while ((str = bfread.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void e10() {
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        byte[] arr = new byte[(int) file.length()];
        try ( InputStream inread = new FileInputStream(file)) {
            while (inread.available() > 0) {
                inread.read(arr);
            }
            for (byte b : arr) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void e9() {
        File file = new File("D:\\Angelina\\Documents\\gym\\musles.docx");
        long b = file.length();
        long kb = file.length() / 1024;
        long mb = file.length() / (1024 * 1024);
        System.out.println("file size in bytes = " + b);
        System.out.println("file size in kb = " + kb);
        System.out.println("file size in mb = " + mb);
    }

    public static void e8() {
        try (BufferedReader bfread = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("print smth : ");
            String str = bfread.readLine();
            System.out.println("rezult: " + str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void e7() {
        File file = new File("D:\\Angelina\\Documents\\2.txt");
        System.out.println("in milliseconds  " + file.lastModified());
        Date date = new Date(file.lastModified());
        System.out.println(" in date" + date);
    }
    public static void e5() {
        File file = new File("D:\\Angelina\\Documents\\2.txt");
        if (file.isFile()) {
            System.out.println(file.getAbsolutePath() + " is a file ");
        } else if (file.isDirectory()) {
            System.out.println(file.getAbsolutePath() + " is a directory ");
        }
    }

    public static String e4() {
        File file = new File("D:\\Angelina\\Documents");
        System.out.print(file.getAbsolutePath());
        if (file.canRead() && file.canWrite()) {
            return " has read and write permission ";
        } else{
            return " No permission ";
        }

    }
    public static String e3() {
        File file = new File("D:\\Angelina\\Documents");
        if (file.exists()) {
            return " exists ";
        } else{
            return " don't exists ";
        }
    }

    public static void e2() {
        File file = new File("D:\\Angelina\\Documents");
        String[] list;
        list = file.list();
        Optional.ofNullable(list).ifPresent(k ->
                Arrays.stream(k).forEach(x -> {
                    if (x.endsWith(".txt")) {
                        System.out.println(x);
                    }
                }));
    }

    public static void e1() {
        File file = new File("D:\\Angelina\\Documents");
        String[] list;
        list = file.list();
        Optional.ofNullable(list).ifPresent(k ->
                Arrays.stream(k).forEach(System.out::println));
    }
    public static void e2_2() {
        File file = new File("D:\\Angelina\\Documents");
        String[] list = file.list((dir, name) -> name.toLowerCase().endsWith(".txt"));
      Optional.ofNullable(list).ifPresent( k->
              Arrays.stream(k).forEach(System.out::println));
    }

}

