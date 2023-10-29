package convertor.services

import convertor.core.ConvertisseurLambert
import convertor.models.{Gps, Lambert}

class ConvertisseurLambertImpl extends ConvertisseurLambert {
  override def toGps(position: Lambert): Gps = Gps(0.0, 0.0)
}
