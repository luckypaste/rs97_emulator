// $Id: DummyPrinterPortDevice.cc 12631 2012-06-14 20:18:24Z m9710797 $

#include "DummyPrinterPortDevice.hh"

namespace openmsx {

bool DummyPrinterPortDevice::getStatus(EmuTime::param /*time*/)
{
	return true; // true = high = not ready
}

void DummyPrinterPortDevice::setStrobe(bool /*strobe*/, EmuTime::param /*time*/)
{
	// ignore strobe
}

void DummyPrinterPortDevice::writeData(byte /*data*/, EmuTime::param /*time*/)
{
	// ignore data
}

string_ref DummyPrinterPortDevice::getDescription() const
{
	return "";
}

void DummyPrinterPortDevice::plugHelper(
	Connector& /*connector*/, EmuTime::param /*time*/)
{
}

void DummyPrinterPortDevice::unplugHelper(EmuTime::param /*time*/)
{
}

} // namespace openmsx