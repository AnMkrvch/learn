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

        }  catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String e6 ( File file) throws IOException {
        FileReader fread = new FileReader(file);
        BufferedReader bfread = new BufferedReader(fread);
        String str = null;
        //String text = "";
        StringBuilder srez = new StringBuilder();

        while ((str = bfread.readLine()) != null) {
            //text += str;
            srez.append(str);
        }
        String rezult = srez.toString();

        return rezult;
    }

    public static void e18_2 (){


        String longest_word = "";
        String current;
        Scanner sc = null;
        try {
            sc = new Scanner(new File("D:\\Angelina\\Documents\\1.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }

        }
        System.out.println("\n"+longest_word+"\n");

    }
    public static void e18 () {
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        Scanner sc = null;
        String rez = "";
        String now = "";

        try {
            sc = new Scanner(file);
            //sc.useDelimiter(" ");
            while(sc.hasNext()){
                now = sc.next();
                if (now.length()>rez.length()){
                    rez = now;
                }

            }
            System.out.println(" the longest word : " + rez);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
    public static void e17_2(){
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        FileReader fread = null;
        try {
            fread = new FileReader(file);
            // BufferedReader bfread = new BufferedReader(fread);
            LineNumberReader lread = new LineNumberReader(fread);

            String str = null;


            while (lread.getLineNumber()<3 && (str = lread.readLine())!= null){
                System.out.println(str);

            }

            lread.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fread.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
    public static void e17(){
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        FileReader fread = null;
        try {
            fread = new FileReader(file);
            BufferedReader bfread = new BufferedReader(fread);

            String str = null;
            int count = 0;


            while (count<3 ){
                str = bfread.readLine();
                System.out.println(str);
                count++;
            }
            bfread.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fread.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
    public static void e16()  {
        File f = new File("D:\\Angelina\\Documents\\1.txt");
        FileWriter fwr = null;

        try {
            fwr = new FileWriter(f,true);
            fwr.write( "\nEnjoy every moment.");





        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fwr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public static void e15(){

        File f = new File("D:\\Angelina\\Documents\\file15.txt");
        //File f2 = new File("D:\\Angelina\\Documents\\re.txt");

        FileWriter fw = null;
        FileReader fr = null;

        try {
            fw = new FileWriter(f);


            fw.write("hello, how are you ");
            int i ;
            fw.close();
            fr = new FileReader(f);
            while ((int)(i=fr.read())!=-1){
                System.out.print((char)i);

            }
            fr.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void e14(){
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        FileReader fread = null;
        try {

            fread = new FileReader(file);
            BufferedReader bfread = new BufferedReader(fread);
            String str = null;
            List<String> text = new ArrayList<>();

            while ((str = bfread.readLine()) != null ){
                text.add(str);
            }
            bfread.close();
//            System.out.print(Arrays.toString(text.toArray()));
            for(String line:text){
                System.out.print(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fread.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void e13(){
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        FileReader fread = null;
        try {
            fread = new FileReader(file);
            BufferedReader bfread = new BufferedReader(fread);
            String str = null;
            String text = "";


            while ((str = bfread.readLine()) != null ){
                text+=str;
                System.out.println(str);
            }
            bfread.close();
            System.out.print(text);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fread.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
    public static void e12(){
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        try {
            FileReader fread = new FileReader(file);
            int i;
            while ((int)(i = fread.read())!=-1){
                System.out.print((char)i);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void e11(){
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        FileReader fread = null;
        try {
            fread = new FileReader(file);
            BufferedReader bfread = new BufferedReader(fread);

            String str = null;

//            do{
//                str = bfread.readLine();
//                if (str == null) break;
//                else
//                    System.out.println(str);

//            }while (str!=null);

            while ((str = bfread.readLine()) != null ){
                System.out.println(str);
            }
            bfread.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fread.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
    public static void e10 (){
        File file = new File("D:\\Angelina\\Documents\\1.txt");
        InputStream inread = null;
        byte[] arr = new byte[(int) file.length()];
        int count = 0;

        try {
            inread = new FileInputStream(file);

            while (inread.available()>0){
                inread.read(arr);
            }
//            System.out.print(count);
            for (int i = 0; i< arr.length; i++){
                System.out.print((char)arr[i]);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                inread.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }
    public static void e9 (){
        File file = new File("D:\\Angelina\\Documents\\gym\\musles.docx");
        long b =  file.length();
        long kb = file.length()/1024;
        long mb = file.length()/(1024*1024);
        System.out.println("file size in bytes = " + b);
        System.out.println("file size in kb = " + kb);
        System.out.println("file size in mb = " + mb);
    }
    public static void e8 (){

//        Scanner in = new Scanner(System.in);
//        System.out.println("print smth : ");
//        String str = in.nextLine();
//        System.out.println("rezult : " + str);


        BufferedReader bfread = new BufferedReader( new InputStreamReader(System.in));
        try {
            System.out.println("print smth : ");
            String str = bfread.readLine();
            System.out.println("rezult: "+ str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public static void e7 (){
        File file = new File("D:\\Angelina\\Documents\\2.txt");
        System.out.println("in milliseconds  " + file.lastModified());
        Date date = new Date(file.lastModified());
        System.out.println (" in date" + date);
    }
    public static void e5 (){
        File file = new File("D:\\Angelina\\Documents\\2.txt");

        if (file.isFile())
            System.out.println(file.getAbsolutePath() + " is a file ");
        else if (file.isDirectory())
            System.out.println(file.getAbsolutePath() + " is a directory ");

    }
    public static String e4 () {
        File file = new File("D:\\Angelina\\Documents");
        System.out.print(file.getAbsolutePath());
        if (file.canRead() && file.canWrite()) return " has read and write permission ";
        else return " No permission " ;

    }
    public static String e3 () {
        File file = new File("D:\\Angelina\\Documents");
        if (file.exists()) return " exists ";
        else return " don't exists ";

    }
    public static void e2 () {
        File file = new File("D:\\Angelina\\Documents");
        String[] list;
        int count = 0;
        list = file.list();
        List <String> txt = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if (list[i].endsWith(".txt")) {
                txt.add(list[i]);
            }
        }
        txt.stream().forEach(System.out::println);
    }
    public static void e1 (){
        File file = new File("D:\\Angelina\\Documents");
        String[] list;
        list =  file.list();
        for (int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }
//        for (String name:list){
//            System.out.println(name);
//        }
    }
    public static void e2_2 (){
        File file = new File("D:\\Angelina\\Documents");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }




}

