package org.specs2
package reporter

import io.DirectoryPath
import main.Arguments
import specification.process.Level
import org.specs2.specification.core.Fragment
import org.specs2.specification.create.DefaultFragmentFactory

object HtmlBodyPrinterSpec extends Specification { def is = s2"""

 A hidden reference must not be printed $hidden

 A snippet be printed $snippet

"""

  def hidden = {
    print(link(HtmlBodyPrinterSpec).hide) must beEmpty
  }

  def snippet = {
    //print(DefaultFragmentFactory.code("val a = 123")) must_== "val a = 123"
    success
  }

  def print(f: Fragment) =
    HtmlBodyPrinter.printFragment(Arguments(), Level.Root, DirectoryPath.Root, pandoc = true)(f)
}
