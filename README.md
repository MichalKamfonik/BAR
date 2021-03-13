# BAR
**B**ook **A**pi that is **R**estful.

## What for?
This application makes you able to manage your books in MySQL Database using not 0... not 1... but **2** controller types!
1. REST controller using JSON data format
1. MVC type controller using JSP views

## How does the model look like?
* Book
  * id
  * isbn
  * title
  * author
  * publisher
  * type

## What are the abilities of this application?
1. REST controller (swagger docu: .../swagger-ui.html)
        
    This controller gives you ability to use following endpoints:
    * .../books (GET) - *list all books*
    * .../books (POST) - *add a book using given data*
    * .../books/{id} (GET) - *show details of the book with given ID*
    * .../books/{id} (PUT) - *update the book with given ID using given data*
    * .../books/{id} (DELETE) - *delete the book with given ID*
1. WebMVC controller

    This controller gives you a graphic interface for managing your books. It provides following endpoints:
    * .../admin/books/all - *list all books*
    * .../admin/books/add - *add a book*
    * .../admin/books/show/{id} - *show details of the book with given ID*
    * .../admin/books/edit/{id} - *edit the book with given ID*
    * .../admin/books/delete/{id} - *delete the book with given ID*

## What technologies were used?
* Spring
* Spring WebMVC
* Spring RestController
* Spring Data JPA
* Hibernate
* Validation
* Hibernate validation
* Swagger2
* MySQL
* JSP
* Expression Language
* JSTL
* Spring form
* Lombok
* Jackson databind
* JSON

## How does it work?
For REST Api refer to Swagger documentation.

Web application:
1. Books list:
   
   ![list_books][list_books]
1. Add book
   
   ![add_book][add_book]
1. Show book details:
   
   ![show_book][show_book]
1. Edit book
   
   ![edit_book][edit_book]
1. Delete book
   
   ![delete_book][delete_book]

[list_books]: images/list.png "Books list"
[add_book]: images/add.png "Add book"
[show_book]: images/show.png "Show book details"
[edit_book]: images/edit.png "Edit book"
[delete_book]: images/delete.png "Delete book"