����   3 ;
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  Enter A Number : 
      java/io/PrintStream println (Ljava/lang/String;)V
     ! nextInt ()I # ...Prime Number... % ...Not A Prime Number... ' src/FindPrimeNumberWhileLoop Code LineNumberTable LocalVariableTable this Lsrc/FindPrimeNumberWhileLoop; main ([Ljava/lang/String;)V args [Ljava/lang/String; sc Ljava/util/Scanner; number I prime i StackMapTable 0 
SourceFile FindPrimeNumberWhileLoop.java ! &           (   /     *� �    )        *        + ,   	 - .  (       `� Y� 	� L� � +� =>6� � � "� � 1� p� ������ � "� � � $� �    )   >      	  
       &  1  7  >  A  G  L  W  _  *   4    ` / 0    U 1 2   H 3 4   F 5 4   C 6 4  7    � &  8   
  9    :