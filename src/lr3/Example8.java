package lr3;

public class Example8 {
    public static void main(String[] args) {
        char letter = 'A';
        char [] alphabet = new char[10];

        int i = 0;
        while(i<10)
        {
            switch (letter)
            {
                case 'A': letter++;
                    break;
                case 'E': letter++;
                    break;
                case 'I': letter++;
                    break;
            }
            alphabet[i]=letter;
            letter++;
            System.out.print(alphabet[i] + " ");
            i++;
        }

    }
}