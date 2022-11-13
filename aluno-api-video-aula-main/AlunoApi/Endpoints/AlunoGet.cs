using AlunoApi.Entities;
using AlunoApi.Repository;
using Microsoft.AspNetCore.Mvc;

namespace AlunoApi.Endpoints
{
    public class AlunoGet
    {
        public static string Template => "/aluno/{id:int}";
        public static string[] Metodo => new string[] { HttpMethod.Get.ToString() };
        public static Delegate Func => Acao;

        public static IResult Acao([FromRoute] int id)
        {
            AlunoRepository alunoCarga = new AlunoRepository();
            alunoCarga.Carga();

            Aluno alunoEcontrado = AlunoRepository.BancoDeDados.FirstOrDefault(a => a.Id.Equals(id));

            if(alunoEcontrado != null)
            {
                return Results.Ok(alunoEcontrado);
            }
            else
            {
                return Results.NotFound();
            }
        }
    }
}
