/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Trung Pham
 * Created: Sep 17, 2016
 */

Select a.Name Employee from Employee a, Employee b where b.Id = a.ManagerId and a.Salary > b.Salary