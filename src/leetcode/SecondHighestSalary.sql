/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Trung Pham
 * Created: Sep 16, 2016
 */

Select (Select Max(Salary)  from Employee Where salary not in(Select Max(Salary) from Employee)) as SecondHighestSalary