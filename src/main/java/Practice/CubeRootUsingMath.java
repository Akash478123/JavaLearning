����   3 e
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  Enter the value of X
      java/io/PrintStream println (Ljava/lang/String;)V
     ! 
nextDouble ()D
 # $ % & ' java/lang/Double valueOf (D)Ljava/lang/Double; ) Enter the value of y + Enter the value of Z
 # - . ! doubleValue@       
 2 3 4 5 6 java/lang/Math pow (DD)D
 2 8 9 : abs (D)D
 2 < = : cbrt ? java/lang/StringBuilder
 >  B Final Result --> 
 > D E F append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 > H E I -(Ljava/lang/Object;)Ljava/lang/StringBuilder;
 > K L M toString ()Ljava/lang/String;
  O P  close R src/CubeRootUsingMath Code LineNumberTable LocalVariableTable this Lsrc/CubeRootUsingMath; main ([Ljava/lang/String;)V args [Ljava/lang/String; sc Ljava/util/Scanner; x Ljava/lang/Double; y z Result 
SourceFile CubeRootUsingMath.java ! Q           S   /     *� �    T        U        V W   	 X Y  S       �� Y� 	� L� � +� � "M� (� +� � "N� *� +� � ":,� , /� 1-� , /� 1c� ,� 7g� ;� ":� � >Y� @A� C� G� J� +� N�    T   .        	  
 #  +  3  <  b  |  �  U   >    � Z [    v \ ]   f ^ _  + V ` _  < E a _  b  b _   c    d