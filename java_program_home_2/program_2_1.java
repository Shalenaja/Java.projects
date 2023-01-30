// Задание 1.
//Дана строка sql-запроса "select * from students where ".
//Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные приведены ниже в виде json строки.
//Если значение null, то параметр не должен попадать в запрос.

//Входная строка:
//{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

//Выходная строка:
//select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow"

package java_program_home_2;

public class program_2_1 {
    private static StringBuilder append;
    
    public static void main(String[] args) {
        String strInput = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String str = strInput.replace("{", "").replace("}", "").replace("\"", "");
        StringBuilder strBuild = new StringBuilder();    
        String [] newStr = str.split(",");
                                                
        for (String ell : newStr) {
            if (ell.contains("null")) {                         
                continue;}
            else {
                String [] newStrRes = ell.split(":");
                for (int i = 0; i < newStrRes.length; i++);{
                    append = strBuild.append(newStrRes[0]).append(" = ")
                    .append(newStrRes[1]).append(" and ");}
            }
        }
        System.out.println("select * from students where name = " + strBuild.substring(0, strBuild.length() - 4));
    }
}
    

