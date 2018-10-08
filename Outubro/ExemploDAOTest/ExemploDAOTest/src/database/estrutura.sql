/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Gabriel Budke
 * Created: 08/10/2018
 */

DROP DATABASE IF EXISTS kleitom;
CREATE DATABASE kleitom;
USE kleitom;

CREATE TABLE macarroes(
    id INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(30),
    marca VARCHAR(30),
    peso DOUBLE,
    aldente BOOLEAN
);
