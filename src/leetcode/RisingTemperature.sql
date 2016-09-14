/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Trung Pham
 * Created: Sep 15, 2016
 */

# Write your MySQL query statement below
Select a.Id as Id from  Weather a, Weather b where b.Date = DATE_SUB(a.Date,INTERVAL 1 DAY) and b.Temperature < a.Temperature