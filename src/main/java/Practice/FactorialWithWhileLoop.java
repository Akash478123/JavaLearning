����   3 H
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  Enter a number for factorial
      java/io/PrintStream println (Ljava/lang/String;)V
     ! nextInt ()I # java/lang/StringBuilder
 "  & factorial is ---> 
 " ( ) * append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 " , ) - (J)Ljava/lang/StringBuilder;
 " / 0 1 toString ()Ljava/lang/String; 3 src/FactorialWithWhileLoop Code LineNumberTable LocalVariableTable this Lsrc/FactorialWithWhileLoop; main ([Ljava/lang/String;)V args [Ljava/lang/String; sc Ljava/util/Scanner; n I fact J i StackMapTable < 
SourceFile FactorialWithWhileLoop.java ! 2           4   /     *� �    5        6        7 8   	 9 :  4   �     I� Y� 	� L� � +� =
B6� !�iB���� � "Y� $%� '!� +� .� �    5   * 
     	  
       #  )  /  H  6   4    I ; <    > = >   1 ? @   / A B   , C @  D    �   E     F    G