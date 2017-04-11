package pckg

package bobsrockets {
  package navigation {
    package launch {
      class Booster1
    }
    class MissionControl {
      val booster1 = new launch.Booster1
      val booster2 = new bobsrockets.launch.Booster2
      val booster3 = new _root_.pckg.launch.Booster3
      val booster31 = new pckg.launch.Booster3
    }
  }
  package launch {
    class Booster2 {
      println(new navi.Navigator )
    }
  }
  
  
}

//Access Qualifier 

package navi {
  private[pckg] class Navigator {
    protected[navi] def useStarChart() = {}
    class LegOfJourney {
      private[Navigator] val distance = 100
    }
    private[this] var speed = 200
  }
}
package launch {
  import navi._
  object Vehicle {
    private[launch] val guide = new Navigator
  }
}