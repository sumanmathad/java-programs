package LeetCode.Solutions;

public class _0595_BigCountries {
  /*
  Table: World
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| name        | varchar |
| continent   | varchar |
| area        | int     |
| population  | int     |
| gdp         | bigint  |
+-------------+---------+
In SQL, name is the primary key column for this table.
Each row of this table gives information about the name of a country, the continent to which it belongs, its area, the population, and its GDP value.
 */

    public static void main(String[] args){
        System.out.println("SELECT name, population, area FROM World WHERE  area >=3000000 or population >=25000000;");
    }
}
