from odoo import models, fields

class Viajero(models.Models):

    _name= "flotaautobuses.viajero"
    _description = "Tabla viajero"

    Nombre = fields.char(string="Nombre")
    Apellido = fields.char(string="Apellido")
    DNI_Pasaporte = fields.char(string="DNI/Pasaporte")
    Viajes = fields.Many2One(flotaautobuses.viaje,string="Viajes")

