# Tasks

- Задача 1 
```
class Test {
 	public static void main(String[ ] args) {
		byte a = 15;
		byte b = a;
		System.out.println(b);
	}
}
```
`Ответ: 15`
```
class Test {
 
	public static void main(String[ ] args) {
		byte a = 15;
		int b = a;
		System.out.println(b);
	}
}
```
`Ответ: 15`

- Задача 2 
```
class Test {
	public static void main(String[ ] args) {
		double a=128;
		byte b=(byte)a;
		System.out.println(b); 
	}
}
```
`Ответ: -128`

- Задача 3 
```
public class Test { 
    public static void main(String[ ] args){     
	char v2 = '\u0031'; 
	char v1 = '2';         // '\u0032';
	char v3 = 50;          // '\u0032';
        System.out.println(v1 + v2 + v3); 
    } 
} 
```
`Ответ: 149`
 
- Задача 4 
```
Сравните 2 фрагмента кода:
 
	1: 	int v1=1; long v2=2; v1=v1+v2;  
	2: 	int v1=1; long v2=2; v1+=v2; 
```
`Ответ: фрагменты эквивалентны.`

- Задача 5. Какой результат выполнения данного кода?
``` 
	int x=1;
	print("x="+x);          // System.out.print
	print(1+2+"text");
	print("text"+1+2);
```
`Ответ:
x=1
3text
text12
`
