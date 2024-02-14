package conditionssctructure;

public class ConditionsStructure {
    public static void main(String[] args) {
        int count = 3;

        //if/else
        System.out.println("//if/else");
        if(count > 2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        //Operador ternário (refatoração do if/else)
        System.out.println("//Operador ternário");
        System.out.println(count > 2 ? "true" : "false");

        //switch case
        System.out.println("//switch case");
        switch (count){
            case 0 :
                System.out.println("case 0");
                break;
            case 3 :
                System.out.println("case 1");
                break;
            default:
                System.out.println("case 2");
                break;
        }

         //Loops
        System.out.println("//loop");
        for(int i = 0; i < 3; i++){
            //inicialmente o valor da varivavel i é 0;
            //enquanto i for menor q 5, adiciona mais 1;

            System.out.println("i é igual a " + i);
        }

        System.out.println("//while");
        //while
        int whileCounter = 0;
        while (whileCounter <= 2){
            System.out.println("whileCounter é igual a " + whileCounter);
            whileCounter++;
        }

    }
}
