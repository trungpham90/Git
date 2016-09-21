/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Trung Pham
 * Created: Sep 22, 2016
 */


Select distinct a.Email Email from Person a, Person b where a.Id != b.Id and a.Email = b.Email 

# Better
Select Email from Person group by Email having count(*) > 1