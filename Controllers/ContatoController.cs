using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Website.Models;

namespace Website.Controllers;

public class ContatoController : Controller
{

    public IActionResult Index()
    {
        return View();
    }

    
}
