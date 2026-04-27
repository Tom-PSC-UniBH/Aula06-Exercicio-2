// Nome: Tom Alexander
// Matrícula: 1261933671


public static boolean isOdd(int number) {
  return number % 2 == 0;
}

void main() {
  var input = new Scanner(System.in);
  System.out.println("Digite um número inteiro: ");
  var number = input.nextInt();
  var result = isOdd(number) ? "par" : "ímpar";
  System.out.println("O número " + number + " é " + result);
  input.close();
}
