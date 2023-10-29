package convertor.core

import convertor.models.{Gps, Lambert}

trait ConvertisseurLambert {
  def toGps(position: Lambert): Gps
}
