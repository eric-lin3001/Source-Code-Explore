# MY WEB SERVICE

- 是一种跨编程语言，跨操作系统的远程调用系统
- 一个应用程序向外界暴露出能通过web访问的API
- 你可以用任何你喜欢的语言，在任何你喜欢的平台上写Web service ，只要我们可以通过Web service标准对这些服务进行查询和访问。

## Web Service VS HTTP

- WS优点：
  - 可以从服务端向客户端推送消息，HTTP协议不行。
  - 消息格式可以是XML。

## Web Service三大技术

- XML+XSD

  - WS采用HTTP协议传输数据，采用XML封装数据（即XML中说明调用远程服务对象的哪个方法，传递的参数是什么，以及服务对象的返回结果是什么）。即XML定义了数据格式。

    - XML优点：

      1）易于建立和分析

      2）与平台无关

      3）与厂商无关

  - XSD（XML SCHEMA）定义数据类型

    - 定义具体的，标准的数据类型
    - 在用某种语言来构造WS时，为了符合WS标准，语言中使用的所有数据类型都必须转化为XSD类型。

- SOAP
  - WebService通过HTTP协议发送请求和接收结果时，发送的请求内容和结果内容都采用XML格式封装，并增加了一些特定的HTTP消息头，以说明HTTP消息的内容格式，这些特定的HTTP消息头和XML内容格式就是SOAP协议。SOAP提供了标准的RPC方法来调用Web Service。
  - SOAP协议 = HTTP协议 + XML数据格式。
- WSDL
  - WS-CLIENT在调用WS-SERVER的服务之前，WS-SERVER需要通过一个WSDL文件，告诉WS-CLIENT服务端的地址是什么，可以调用哪些方法，该方法有哪些入参和返回值等。
  - WSDL是基于XML的，是客户端和服务端都能理解的标准格式。
  - WS服务提供商可以通过两种方式来暴露它的WSDL文件地址：
    - <font color="#dd0000">注册到UDDI服务器。</font>
    - 直接告诉客户端调用者。



