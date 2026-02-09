package com.designpattern.smartlibrarymanagement;

//User interface extending Observer
interface User extends Observer {
	void showRole(); 

	void reserveBook(String bookName); 
}