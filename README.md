pdu-converter
=============
This class encodes a message and a delivery mobilenumber to PDU-Format. It can be used to send SMS by older mobilephones (e.g. Siemens used PDU format) via serial port (serial communication not included).

To test the PDU converted command you can connect your mobile phone with e.g. HyperTerminal and send the encoded string to your phone.

Sending sms may cause additional costs.

Example Command
=============
AT+CMGW=29
0791947106004034040d919471064015120000312160807183040CC8309BFD65DDF7236D95
