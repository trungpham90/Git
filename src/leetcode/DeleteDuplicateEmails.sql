/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Trung Pham
 * Created: Sep 23, 2016
 */

# Write your MySQL query statement below
delete from Person where Id in ( Select Id From (Select a.Id Id From Person a, Person b where a.Email = b.Email and a.Id > b.Id)as C )