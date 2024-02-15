from odoo import models, fields

class Viaje(models.Models):

    _name= "flotaautobuses.viaje"
    _description = "Tabla viaje"

    Origen = fields.Char(String="Origen")
    Destino = fields.Char(String="Destino")
    Vehiculo = fields.Many2One(flotaautobuses.vehiculo,string="Vehiculo")
    Fecha = fields.Date()
    Viajeros = fields.Many2One(flotaautobuses.viajero,string="Viajeros")
    Precio = fields.Char(double="Precio")

