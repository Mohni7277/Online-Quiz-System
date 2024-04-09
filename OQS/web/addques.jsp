<%-- 
    Document   : addques
    Created on : Aug 19, 2021, 2:42:37 PM
    Author     : Kommal Kaushal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Document</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <form action="AddServlet" method="Post">
        <div class="add-q-main-body">
            <div class="add-q-outer">
                <div class="add-q-inner">
                    <div class="add-q-inner1">
                        <div class="ques-no-tick">
                            <div class="add-q-ques-no">
                                1
                            </div>
                            <div class="add-q-tick">
                                <button type="submit"><i class="fa fa-check fa-3x"></i></button>
                            </div>
                        </div>
                        <div class="ques-option">
                            <div class="enter-ques">
                                <input type="text" class="enter-ques-text-box" value="Enter question" name="quest">
                            </div>
                            <div class="enter-options">
                                <ul>
                                    <li>
                                        <input type="radio" id="q1-answers-A" value="A">
                                        <label for="q1-answers-A"><input type="text" name="opn1" value="Option 1"></label>
                                    </li>
                                    <li>
                                        <input type="radio" id="q1-answers-B" value="B">
                                        <label for="q1-answers-B"><input type="text" name="opn2" value="Option 2"></label>
                                    </li>
                                    <li>
                                        <input type="radio" id="q1-answers-C" value="C">
                                        <label for="q1-answers-C"><input type="text" name="opn3" value="Option 3"></label>
                                    </li>
                                    <li>
                                        <input type="radio" id="q1-answers-D" value="D">
                                        <label for="q1-answers-D"><input type="text" name="opn4" value="Option 4"></label>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="add-q-inner2">
                        <div class="ans-box">
                            <div class="ans-box-header">
                                <div class="ans-box-header-text">Answer</div>
                            </div>
                            <div class="ans-txtbox-label">
                                <label for="ans-of-ques">Enter the correct option number</label>
                                <input type="text" class="ans-of-ques" value="Correct Answer" name="ans">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </form>
    </body>
</html>
