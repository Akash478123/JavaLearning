����   3 Q
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  )Enter a string let's check for Palindrome
      java/io/PrintStream println (Ljava/lang/String;)V
     ! next ()Ljava/lang/String;
 # $ % & ' java/lang/String toCharArray ()[C
 ) * + , - java/lang/Boolean valueOf (Z)Ljava/lang/Boolean;
 ) / 0 1 booleanValue ()Z 3 
palindrome 5 not palindrome 7 src/PalindromeCheck Code LineNumberTable LocalVariableTable this Lsrc/PalindromeCheck; main ([Ljava/lang/String;)V i I args [Ljava/lang/String; sc Ljava/util/Scanner; s Ljava/lang/String; array1 [C array2 pal Ljava/lang/Boolean; StackMapTable B H 
SourceFile PalindromeCheck.java ! 6           8   /     *� �    9        :        ; <   	 = >  8  3     m� Y� 	� L� � +� M,� "N-:� (:6-�� #-�dd4-4� � (:� 	����� .� � 2� � � 4� �    9   >        	  
      &  0  A  G  J  P  Y  d  l " :   H  ) ' ? @    m A B    b C D   U E F   P G H    M I H  & G J K  L   " � )  M  # N N )   �   O    P