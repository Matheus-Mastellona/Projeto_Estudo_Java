
## **Guia Rápido Java**

• Atalho para aplicar Quick Fix no VS Code (sem mouse): <br>
   Windows/Linux: Ctrl + . (Control + ponto)

• Atalho para selecionar a linha que está no VS Code (sem mouse):<br>
   Ctrl + L no Windows
   
• \u = Valor Unitário ou Unicode <br>
  Exemplo: \u0061 (equivale a 'a')

• Operador Ternário
  (expressão booleana) ?<br> código 1 : código 2;
  Exemplo: int menor = (a < b) ? a : b;

• Atalho do VS Code <br>
  Shift + Alt + Seta = Criar a mesma linha

• Quando necessário reload, siga: Ctrl + Shift + P → "Reload Window"

• Quando temos a seguinte expressão: System.out.println(); <br>Sabemos que o out é um atributo pois não está sob parenteses, já o println é um metodo

• Link do sumario da interface: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/function/package-summary.html

• TODOs 
* TODO: Some TODO in my code
* FIXME Some FIXME in my code
* BUG: Some BUG in my code
* NOTE: Some NOTE in my code


## **Especificadores de Formato**

 

%d  -> Inteiro (int, long, short)
      Exemplo: System.out.printf("Idade: %d", 25);

%f  -> Número Decimal (float, double)
      Exemplo: System.out.printf("Altura: %.2f", 1.75);

%s  -> String (String)
      Exemplo: System.out.printf("Nome: %s", "Divo");

%c  -> Caractere (char)
      Exemplo: System.out.printf("Letra: %c", 'A');

%n  -> Nova linha (equivalente a \n)
      Exemplo: System.out.printf("Linha 1%nLinha 2");


## **Debug**


Step Over 
      (F10)

Step Into 
      (F11)

Continue 
      (F5)