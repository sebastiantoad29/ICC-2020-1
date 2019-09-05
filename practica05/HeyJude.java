public class HeyJude {
  public static void main (String[] args) {
//Declaracion de variables
    String hey = "Hey Jude";
    String dont = "don´t";
    String makeitbad = "make it bad";
    String take = "Take a sad song and";
    String remember = "Remember to let her";
    String then = "Then you";
    String canstart = "can start to";
    String beafraid = "be afraid";
    String makeitbetter = "make it better";
    String into = "into your heart";
    String under = "under your skin";
    String begin = "begin to";
    String youwere = "You were made to go out and get her";
    String na = "na";
    String better = "better";
    String oh = "oh";
    String letmedown = "let me down";
    String youhavefound = "You have found her, now go and get her";
    int p = 0;
    //Ocupo el while para que se ejecute todo a la vez
    while(p < 7) {
     //Imprimimos Hey Jude en cada parrafo que lo contenga
        if(p == 0 || p == 1 || p == 3 || p == 5){
          System.out.println(" ");
          System.out.print(hey + " " +  dont + " ");
          //la frase make it bad solo esta en el parrado 1 y 4
        }if(p == 0 || p == 5){
          System.out.println(makeitbad);
          //luego el parrafo 2, con dos de los versos
        }if(p == 1){
          System.out.println(beafraid);
          System.out.println(youwere);
          //parrafo 4 lo mismo con el parrafo 2, como son frases unicas, entonces se ejecutan normal
        }if(p == 3){
          System.out.println(letmedown);
          System.out.println(youhavefound);
        //como el parrafo 1 y 6 tienen el segundo verso igual, se jecuta para los dos
        }if(p == 0 || p == 5 ){
          System.out.print(take);
          System.out.println(" "+makeitbetter);
        //aplque un for, que funciona para repeticiones, en este caso "na"
        }if(p == 2 || p == 4 || p == 6){
          for(int i = 0; i<= 9; i +=1 ){
            System.out.print(na + " ");
          }
        //despues remember que todos los parrafos lo llevan excepto los que inician con "na "
        }if(p == 0 || p == 1 || p == 3 || p == 5){
          System.out.print(remember + " ");
        //la frase de into you heart es para le parrafo 1 y 4
        }if(p == 0 || p == 3){
          System.out.println(into);
        //la frase under your skin pero para el 2 y 6 parrafos
        }if(p == 1 || p == 5){
          System.out.println(under);
        // la frase then  para la mayoria de parrafos
        }if(p == 0 || p == 1 || p == 3 || p == 5){
          System.out.print(then);
        //can start es solo para el 1 y el 4
        }if(p == 0 || p == 3){
          System.out.print(" "+canstart);
        //begin es para wl 2 y el 6
        }if(p == 1 || p == 5){
          System.out.print(" "+ begin);
        //aplique un for para "better" lo mismo que con "na"
        }if(p == 0 || p == 1 || p == 3 || p == 5){
          System.out.println(" "+makeitbetter);if(p == 5){
            for(int a = 0; a < 5; a ++){
              System.out.print(better+" ");
            }
            System.out.print(oh);
            System.out.println(" ");
          }
          System.out.println(" ");
        }if(p==6){
          System.out.print(hey);
          //finalmente le di el espacio a los parrafos que llevan "na"
        }if(p == 2 || p == 4 || p == 6){
          System.out.println(" ");
        }

        p = p + 1;

      }
    }
  }

/*
Hey Jude, don’t make it bad
Take a sad song and make it better
Remember to let her into your heart
Then you can start to make it better

Hey Jude, don’t be afraid
You were made to go out and get her
Remember to let her under your skin
Then you begin to make it better

Na na na na na na na na na na

Hey Jude, don’t let me down
You have found her, now go and get her
Remember to let her into your heart
Then you can start to make it better

Na na na na na na na na na na

Hey Jude, don’t make it bad
Take a sad song and make it better
Remember to let her under your skin
Then you begin to make it better
better better better better better, oh

Na na na na na na na na na na Hey Jude  */
