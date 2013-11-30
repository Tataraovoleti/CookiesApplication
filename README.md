CookiesApplication
==================

This is the session management concept by using Cookies in java

In java web application we can maintain session using four ways.

1. Hidden form fields
2. Http Cookies
3. Http Session
4. Url Rewriting

In this example i used cookies for session management.

In this SetCookies.java servlet i m adding coookies,
first we are getting field values from jsp page and after we are reading through our servlet
and adding that values to cookies.

In SFCookies.java servlet we are reading the cookies values.

Disadvatages of Cookies
=======================
1. Cookies are travelled over the network, so some browsers had restriction on cookies
2. They cann't store java objects. they can store only palin values.
