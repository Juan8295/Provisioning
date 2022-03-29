terraform {
  backend "azurerm" {
    resource_group_name  = "pers-juan_goez_cordoba-rg"
    storage_account_name = "storagejuan123"
    container_name       = "tstate"
    key                  = "RSVvedYSmyL8EcDQWy6xoXd4WnReRi3j2lTl/4YLhQyDGPc80mjyPYdVaveDw7uhW0EjvPpBN/KD/2Wz9iIqNQ=="
  }
}