����   3 \
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  Enter your name
      java/io/PrintStream println (Ljava/lang/String;)V
     ! next ()Ljava/lang/String; # Enter your age
  % & ' nextInt ()I ) Enter your salary
  + , - 
nextDouble ()D / java/lang/StringBuilder
 .  2 your name is  
 . 4 5 6 append -(Ljava/lang/String;)Ljava/lang/StringBuilder; 8 your age is 
 . : 5 ; (I)Ljava/lang/StringBuilder; = you salary is 
 . ? 5 @ (D)Ljava/lang/StringBuilder;
 . B C ! toString
  E F  close H src/ScannerClass Code LineNumberTable LocalVariableTable this Lsrc/ScannerClass; main ([Ljava/lang/String;)V args [Ljava/lang/String; sc Ljava/util/Scanner; name Ljava/lang/String; age I salary D 
SourceFile ScannerClass.java ! G           I   /     *� �    J        K        L M   	 N O  I   �     d� Y� 	� L� � +� M� "� +� $>� (� +� *9� � .Y� 01� 3,� 37� 3� 9<� 3� >� A� +� D�    J   * 
     	  
      %  -  3  _  c  K   4    d P Q    Y R S   L T U  % ? V W  3 1 X Y   Z    [