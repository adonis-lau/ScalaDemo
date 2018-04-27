package bid.adonis.lau

/**
  * 访问修饰符
  */
class AccessModifiers {

  /**
    * private
    */
  class Outer {

    class Inner {
      private def funcation() {
        println("f")
      }

      class InnerMost {
        //正确
        funcation()
      }

    }

    //错误
    //    (new Inner).funcation()
  }


  /**
    * protected
    */
  class Super {
    protected def funcation() {
      println("f")
    }

    class Sub extends Super {
      //正确
      funcation()
    }

  }

  class Other {
    //错误
    //    (new Super).funcation()
  }


  /**
    * public
    */
  class OuterPub {

    class InnerPub {
      def funcation(): Unit = {
        println("f")
      }

      class InnerMostPub {
        //正确
        funcation()
      }

    }

    //正确 因为function()是public
    (new InnerPub).funcation()
  }

}


/**
  * 作用域保护
  */
//package bobsrocckets {
//  package navigation {
//
//    private[bobsrockets] class Navigator {
//      protected[navigation] def useStarChart() {}
//
//      class LegOfJourney {
//        private[Navigator] val distance = 100
//      }
//
//      private[this] var speed = 200
//    }
//
//  }
//
//  package launch {
//
//    import bid.adonis.lau.bobsrocckets.navigation._
//
//    object Vehicle {
//      private[launch] val guide = new Navigator
//    }
//
//  }
//
//}
//上述例子中，类Navigator被标记为private[bobsrockets]就是说这个类对包含在bobsrockets包里的所有的类和对象可见。
//比如说，从Vehicle对象里对Navigator的访问是被允许的，因为对象Vehicle包含在包launch中，
//而launch包在bobsrockets中，相反，所有在包bobsrockets之外的代码都不能访问类Navigator。
