����   3 F
      java/lang/Object <init> ()V	  	 
   java/lang/System out Ljava/io/PrintStream;  9Enter a year and I will tell if it is leap year or not :)
      java/io/PrintStream println (Ljava/lang/String;)V  java/util/Scanner	     in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     ! nextInt ()I # java/lang/StringBuilder
 " 
 " & ' ( append (I)Ljava/lang/StringBuilder; *  This is leap year
 " , ' - -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 " / 0 1 toString ()Ljava/lang/String; 3 Not a leap year 5 src/LeapYearForLoop Code LineNumberTable LocalVariableTable this Lsrc/LeapYearForLoop; main ([Ljava/lang/String;)V args [Ljava/lang/String; sc Ljava/util/Scanner; year I StackMapTable 
SourceFile LeapYearForLoop.java ! 4           6   /     *� �    7        8        9 :   	 ; <  6   �     R� � � Y� � L+� =p� 
dp� �p� � � "Y� $� %)� +� .� � � 2� �    7           	  
 -  I  Q  8        R = >    ? ? @   : A B  C    � %   D    E