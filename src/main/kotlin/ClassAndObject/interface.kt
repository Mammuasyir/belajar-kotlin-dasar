package ClassAndObject


//Interface classes = classes that have methods without bodies
interface InputHandler {

    fun clicked()
    fun doubleClick()
    fun singleClick()

}

class Phone: InputHandler {
    override fun doubleClick() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun singleClick() {
    }

    override fun clicked() {
        println("Phone Clicked")
    }
}

class Button: InputHandler {
    override fun doubleClick() {
        println("double click")
    }

    override fun singleClick() {
        println("Single Click")
    }

    override fun clicked() {
        println("Button Clicked")
    }
}

class Text: InputHandler{
    override fun clicked() {
        TODO("Not yet implemented")
    }

    override fun doubleClick() {
        TODO("Not yet implemented")
    }

    override fun singleClick() {
        TODO("Not yet implemented")
    }

}




fun main(args: Array<String>) {

    var myButton = Button()
    myButton.clicked()
    myButton.doubleClick()

    var phone = Phone()
    phone.clicked()

}