package project;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import project.controller.FirmaControllerTest;
import project.controller.Korisnik_servisaControllerTest;
import project.controller.KvarConrollerTest;
import project.controller.ObavestenjeConrollerTest;
import project.controller.SednicaControllerTest;
import project.controller.StanControllerTest;
import project.controller.ZapisnikControllerTest;
import project.controller.ZgradaControllerTest;
import project.service.FirmaServiceTest;
import project.service.Korisnik_ServisaServiceTest;
import project.service.KvarServiceTest;
import project.service.ObavestenjeServiceTest;
import project.service.SednicaServiceTest;
import project.service.StanServiceTest;
import project.service.ZapisnikServiceTest;
import project.service.ZgradaServiceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  ZgradaServiceTest.class,
  ZgradaControllerTest.class,
  ObavestenjeServiceTest.class,
  ObavestenjeConrollerTest.class,
  KvarServiceTest.class,
  KvarConrollerTest.class,
  FirmaServiceTest.class,
  FirmaControllerTest.class,
  Korisnik_ServisaServiceTest.class,
  Korisnik_servisaControllerTest.class,
  ZapisnikServiceTest.class,
  ZapisnikControllerTest.class,
  SednicaServiceTest.class,
  SednicaControllerTest.class,
  StanServiceTest.class,
  StanControllerTest.class,
})
public class ZgradaSuite {

}
