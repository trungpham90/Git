/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Trung Pham
 * Created: Sep 14, 2016
 */
Select name as Customers from Customers where Id not in (Select Customers.Id from Customers join Orders on Customers.Id = Orders.CustomerId)

