class Main {
    public static void main(String[] args) {
        Exercicio1 exercicio1 = new Exercicio1();
        Exercicio2 exercicio2 = new Exercicio2();
        Exercicio3 exercicio3 = new Exercicio3();
        Exercicio4 exercicio4 = new Exercicio4();
        Exercicio5 exercicio5 = new Exercicio5();
        Exercicio6 exercicio6 = new Exercicio6();
        Exercicio7 exercicio7 = new Exercicio7();
        Exercicio8 exercicio8 = new Exercicio8();
        exercicio1.resposta1();
        exercicio2.resposta2();
        exercicio3.resposta3();
        exercicio4.resposta4();
        exercicio5.resposta5();
        exercicio6.resposta6();
        exercicio7.resposta7();
        exercicio8.resposta8();
    } 
}

class Exercicio1 { 
    public static void resposta1() {
        System.out.println("Exercicio1\n");
        for (int i = 150; i <= 300; i++) {
            System.out.print(i++ + " ");
        }
        System.out.println("\n");
    }
}

class Exercicio2 {
    public static void resposta2() {
        System.out.println("Exercicio2\n");
        for (int i = 1; i < 1000; i++) {
            System.out.print(i++ + " ");
        }
        System.out.println("\n");
    }
}

class Exercicio3 {
    public static void resposta3() {
        System.out.println("Exercicio3\n");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }
}

class Exercicio4 {
    public static void resposta4() {
        System.out.println("Exercicio4\n");
        for (int n = 1; n <= 10; n++) {
            int fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + n + " é " + fatorial);
        }
        System.out.println("\n");
    }
}

class Exercicio5 {
    public static void resposta5() {
        System.out.println("Exercicio5\n");
        for (int n = 1; n <= 40; n++) {
            long fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + n + " é " + fatorial);
        }
        System.out.println("\n");
    }
}

class Exercicio6 {
    public static void resposta6() {
        System.out.println("Exercicio6\n");
        int primeiro = 0;
        int segundo = 1;
        System.out.println(primeiro); // Imprime o primeiro número da série
        while (segundo <= 100) {
            System.out.print(segundo + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        System.out.println("\n");
    }
}

class Exercicio7 {
    public static void resposta7() {
        System.out.println("Exercicio7\n");
        int x = 13;
        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
            }
            else {
                x = 3 * x + 1;
        }
        System.out.print(x + " -> "); 
        }
        System.out.println("\n");
    }
}

class Exercicio8 {
    public static void resposta8() {
        System.out.println("Exercicio8\n");
        
        }{

        System.out.println("\n");
    }
}
