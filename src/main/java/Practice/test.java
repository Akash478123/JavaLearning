����   3 I
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  )Enter a string let's check for Palindrome
      java/io/PrintStream println (Ljava/lang/String;)V
     ! next ()Ljava/lang/String;
 # $ % & ' java/lang/String toCharArray ()[C ) Reversed string:
  + , - print (C)V
  /   1 src/test Code LineNumberTable LocalVariableTable this 
Lsrc/test; main ([Ljava/lang/String;)V i I args [Ljava/lang/String; sc Ljava/util/Scanner; s Ljava/lang/String; array1 [C array2 StackMapTable < B 
SourceFile 	test.java ! 0           2   /     *� �    3        4        5 6   	 7 8  2  /     l� Y� 	� L� � +� M,� "N-��:6-�� --�dd4U���� (� 6�� � 4� *���� � .�    3   :      	  
     #  -  ;  A  I  T  _  e  k  4   H  &  9 :  L  9 :    l ; <    a = >   T ? @   O A B  # I C B  D   # � &  E  # F F  � � 
�   G    H